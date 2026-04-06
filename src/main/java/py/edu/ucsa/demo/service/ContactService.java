package py.edu.ucsa.demo.service;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestParam;
import py.edu.ucsa.demo.Dto.ContactRequest;
import py.edu.ucsa.demo.entity.Contact;
import py.edu.ucsa.demo.repository.ContactRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    public String saveContact(ContactRequest request) {
        Contact contact = new Contact();
        contact.setName(request.getName());
        contact.setEmail(request.getEmail());
        contact.setTelefono(request.getNumber());

        Contact savedContact = contactRepository.save(contact);
      return "Contact saved with ID:  " + savedContact.getId() + "\nName: " + savedContact.getName();
  }
    public List<Contact> listAll() {
        return contactRepository.findAll();
    }
    public Optional<Contact> listtById(Long id) {
        return contactRepository.findById(id);
    }
    public Optional<Contact> updateContact(Long id, ContactRequest request) {
        Optional<Contact> contactOptional = contactRepository.findById(id);
        if (contactOptional.isPresent()) {
            Contact contact = contactOptional.get();
            contact.setName(request.getName());
            contact.setTelefono(request.getNumber());
            contact.setEmail(request.getEmail());

            Contact contactUpdated = contactRepository.save(contact);
            return Optional.of(contactUpdated);

        }
        return Optional.empty();
    }
    public boolean deleteContact(Long id) {
        if (contactRepository.existsById(id)) {
            contactRepository.deleteById(id);
            return true;
        }

        return false;
    }
    public Optional<Contact> listByEmail(String email){
        return contactRepository.findByEmail(email);
    }
    }

