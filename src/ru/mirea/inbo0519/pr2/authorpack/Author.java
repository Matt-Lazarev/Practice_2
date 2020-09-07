package ru.mirea.inbo0519.pr2.authorpack;

//does not contain setter for the members "name" and "gender", contains setter for the member "email"
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString()
    {
        String gen = String.valueOf(gender);
        if(gen.equalsIgnoreCase("M"))
            return name + " (m) at " + email;
        if(gen.equalsIgnoreCase("F"))
            return name + " (ms) at " + email;
        return "incorrect gender";
    }
}
