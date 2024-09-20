/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivan;

class Account {
    
          int lastId = 0;
    int id;
  String firstName;
  String lastName;
  String email;
  String username;
  String password;

    public Account(String firstName, String lastName, String email, String username, String password) {
        this.id = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String toString() {
        System.out.println("-----------------------------------------------------------------------------");
        return "ID: " + id + " | First Name: " + firstName + "| Last Name: " + lastName + 
               "| Email: " + email + "| Username: " + username;
        
    
}
    
}