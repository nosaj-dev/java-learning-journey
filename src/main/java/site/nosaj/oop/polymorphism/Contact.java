package site.nosaj.oop.polymorphism;

class Contact {
    private String name = null;
    private String email = null;
    private int phone = 0;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void notReady(){
        System.out.println("Not ready to create the contact. Check if all required info is set.");
    }

    public void addContact() {
        if(this.name==null||this.email==null||this.phone==0) {
            notReady();
        }
        else System.out.println("Added contact with next info: " + "\n" +
                "Name: " + this.name + "\n" +
                "Email: " + this.email + "\n" +
                "Phone: " + this.phone);
    }

}
