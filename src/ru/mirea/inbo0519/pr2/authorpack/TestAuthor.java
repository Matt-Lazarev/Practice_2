package ru.mirea.inbo0519.pr2.authorpack;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author author1 = new Author("Matthew", "matthew@gmail.com", 'M');
        Author author2 = new Author("Ann", "ann@gmail.com", 'F');
        System.out.println("Author1 name: " + author1.getName());
        System.out.println("Author2 name: " + author2.getName());

        System.out.println("\nAuthor1 email: " + author1.getEmail());
        System.out.println("Author2 name: " + author2.getEmail());

        System.out.println("\nFull info about the authors: ");
        System.out.println(author1);
        System.out.println(author2);
    }
}
