/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_library_management;

/**
 *
 * @author Fazle Rabbi
 */
public class Book {
    public String bookName;
    public String authorName;
    public String edition;
    public String editor;
    public String publication;
    public String bookCategory;
    public String isbn; 
    
    DatabaseConnection database;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
        
    public String ShowBookTable()
    {
        String bookTable ;
        bookTable = "INSERT INTO book_lists(Book_Name, Writer_Name, Edition, Editor, Catagory, Publisher, ISBN) "
                    + "VALUES ('"+bookName+"','"+authorName+"','"+edition+"','"+editor+"',"
                    + "'"+bookCategory+"','"+ publication +"','"+isbn+"')";
        return bookTable;
    }
}
