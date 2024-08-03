package site.nosaj.oop.polymorphism;

class ContactWithOnlyPhone extends Contact{
    @Override
    public void addContact() {
        if(getName()==null||getPhone()==0) {
            notReady();
        }
        else System.out.println("Added contact with next info: " + "\n" +
                "Name: " + getName() + "\n" +
                "Phone: " + getPhone());
    }
}
