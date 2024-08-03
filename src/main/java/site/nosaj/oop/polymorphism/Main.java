package site.nosaj.oop.polymorphism;

class Main {
    public static void main(String[] args) {
        Contact zaki = new Contact();
        Contact anqi = new ContactWithOnlyEmail();
        Contact heri = new ContactWithOnlyPhone();

        zaki.setName("zaki");
        zaki.setEmail("zaki@zaki");
        zaki.setPhone(07755);

        anqi.setName("anqi");
        anqi.setEmail("anqi@zaki");

        heri.setName("heri");
        heri.setPhone(07552);

        Contact[] contactList = new Contact[]{zaki, anqi, heri};


        for (Contact contact : contactList) {
            contact.addContact();
        }

        zaki = Operations.createContact("zaki", "zaki@zaki", 0752);
        anqi = Operations.createContact("anqi", "anqi@anqi");
        heri = Operations.createContact("heri", 075222);

        Contact[] contactList2 = new Contact[]{zaki, anqi, heri};

        for (Contact contact : contactList2) {
            contact.addContact();
        }

    }
}
