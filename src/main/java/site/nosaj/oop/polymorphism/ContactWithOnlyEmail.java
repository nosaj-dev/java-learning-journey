package site.nosaj.oop.polymorphism;

class ContactWithOnlyEmail extends Contact {
    @Override
    public void addContact() {
        if(getName()==null||getEmail()==null) {
            notReady();
        }
        else System.out.println("Added contact with next info: " + "\n" +
                "Name: " + getName() + "\n" +
                "Email: " + getEmail());
    }

}

