package py.edu.ucsa.demo.controller;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import py.edu.ucsa.demo.Dto.ContactRequest;
import py.edu.ucsa.demo.entity.Contact;
import py.edu.ucsa.demo.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactRequestController {

    private final ContactService contactService;

    public ContactRequestController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<String> saveContact(@Valid @RequestBody ContactRequest request) {
      String resopnse = contactService.saveContact(request);
      return ResponseEntity.ok(resopnse);
    }
    @GetMapping
    public ResponseEntity<List<Contact>> showContact() {
        List<Contact> contactsList = contactService.listAll();
        return ResponseEntity.ok(contactsList);
    }
    @GetMapping("/{id}")
    public ResponseEntity <Contact> getContactById(@PathVariable Long id) {
        return ResponseEntity.of(contactService.listtById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateContact(
            @PathVariable Long id,
            @Valid @RequestBody ContactRequest request
    ) {
        return ResponseEntity.of(contactService.updateContact(id,request));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        boolean deleted = contactService.deleteContact(id);

        if (deleted) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<Contact> getByEmail(@PathVariable String email) {
        return ResponseEntity.of(contactService.listByEmail(email));
    }
    // Forma con Reponse entity resolviendo todo dentro del controller
   /*
    public ResponseEntity<String> saveContact(@Valid @RequestBody ContactRequest request){
        return ResponseEntity.status(201).body("Contacto guardado: "+ request.getName());
    }

    */
    // Forma con metodo?

   /* @GetMapping
    public String getContact (@RequestBody ContactRequest request) {
        return "Datos del Contacto: \n" + request.getName() + "\n" + request.getEmail() +"\n"+ request.getNumber();
    }
*/
}
