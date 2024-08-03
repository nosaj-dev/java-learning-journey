package site.nosaj.oop.polymorphism;

class Operations {
    public static Contact createContact(String name, String email, int phone) {
        Contact newContact = new Contact();
        newContact.setName(name);
        newContact.setEmail(email);
        newContact.setPhone(phone);
        return newContact;
    }

    public static Contact createContact(String name, String email) {
        ContactWithOnlyEmail newContact = new ContactWithOnlyEmail();
        newContact.setName(name);
        newContact.setEmail(email);
        return newContact;
    }

    public static Contact createContact(String name, int phone) {
        ContactWithOnlyPhone newContact = new ContactWithOnlyPhone();
        newContact.setName(name);
        newContact.setPhone(phone);
        return newContact;
    }
}
