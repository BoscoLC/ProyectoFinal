package System;

public class Seller {

    String name;
    String surname1;
    String surname2;
    String email;
    String user;
    String password;
    int phone;
    String position;
    String address;
    String type;
    int id;

    public Seller()
    {
        
    }
    public Seller(int id, String name, String surname1, String surname2, String email, String user, String password, int phone, String position, String address, String type) {
        this.id = id;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.email = email;
        this.user = user;
        this.password = password;
        this.phone = phone;
        this.position = position;
        this.address = address;
        this.type = type;
    }

// Métodos SET
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

// Métodos GET
    public String getName() {
        return name;
    }

    public String getSurname1() {
        return surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public String getEmail() {
        return email;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public int getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    String[] getRow() {
        String[] row = new String[11];
        row[0] = String.valueOf(id);
        row[1] = name;
        row[2] = surname1;
        row[3] = surname2;
        row[4] = email;
        row[5] = user;
        row[6] = password;
        row[7] = "" + phone;
        row[8] = position;
        row[9] = address;
        row[10] = type;
        return row;
    }

}
