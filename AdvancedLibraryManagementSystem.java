import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

interface LibraryOperations {

    void addBook(Book book);

    void removeBook(int id);

    void searchBook(String keyword);

    void issueBook(int bookId, int memberId);

    void returnBook(int bookId);

    void viewAllBooks();

    void addMember(Member member);

    void viewMembers();

    void saveData();

    void loadData();
}

// BOOK CLASS
class Book implements Serializable {

    int id;
    String title;
    String author;
    String category;
    boolean issued;

    Book(int id, String title, String author, String category) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.issued = false;
    }

    @Override
    public String toString() {

        return "Book ID: " + id +
                " | Title: " + title +
                " | Author: " + author +
                " | Category: " + category +
                " | Status: " +
                (issued ? "Issued" : "Available");
    }
}

// MEMBER CLASS
class Member implements Serializable {

    int memberId;
    String name;

    Member(int memberId, String name) {

        this.memberId = memberId;
        this.name = name;
    }

    @Override
    public String toString() {

        return "Member ID: " + memberId +
                " | Name: " + name;
    }
}

// TRANSACTION CLASS
class Transaction implements Serializable {

    int bookId;
    int memberId;

    LocalDate issueDate;
    LocalDate returnDate;

    Transaction(int bookId, int memberId) {

        this.bookId = bookId;
        this.memberId = memberId;

        this.issueDate = LocalDate.now();

        this.returnDate = null;
    }

    @Override
    public String toString() {

        return "Book ID: " + bookId +
                " | Member ID: " + memberId +
                " | Issue Date: " + issueDate +
                " | Return Date: " +
                (returnDate == null ? "Not Returned" : returnDate);
    }
}

// LIBRARY CLASS
class Library implements LibraryOperations {

    ArrayList<Book> books = new ArrayList<>();

    ArrayList<Member> members = new ArrayList<>();

    ArrayList<Transaction> transactions = new ArrayList<>();

    final String BOOK_FILE = "books.dat";

    final String MEMBER_FILE = "members.dat";

    final String TRANSACTION_FILE = "transactions.dat";

    // CONSTRUCTOR WITH DEFAULT BOOKS
    Library() {

        books.add(new Book(
                101,
                "Java Programming",
                "James Gosling",
                "Programming"
        ));

        books.add(new Book(
                102,
                "Data Structures",
                "Mark Allen Weiss",
                "Computer Science"
        ));

        books.add(new Book(
                103,
                "Operating Systems",
                "Galvin",
                "Computer Science"
        ));

        books.add(new Book(
                104,
                "Database Management System",
                "Korth",
                "Database"
        ));

        books.add(new Book(
                105,
                "Python Basics",
                "Guido Van Rossum",
                "Programming"
        ));

        books.add(new Book(
                106,
                "Computer Networks",
                "Forouzan",
                "Networking"
        ));

        books.add(new Book(
                107,
                "Artificial Intelligence",
                "Stuart Russell",
                "AI"
        ));
    }

    // ADD BOOK
    @Override
    public void addBook(Book book) {

        for (Book b : books) {

            if (b.id == book.id) {

                System.out.println("Book ID already exists!");

                return;
            }
        }

        books.add(book);

        System.out.println("Book added successfully!");
    }

    // REMOVE BOOK
    @Override
    public void removeBook(int id) {

        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {

            Book b = iterator.next();

            if (b.id == id) {

                if (b.issued) {

                    System.out.println("Cannot remove issued book!");

                    return;
                }

                iterator.remove();

                System.out.println("Book removed successfully!");

                return;
            }
        }

        System.out.println("Book not found!");
    }

    // SEARCH BOOK
    @Override
    public void searchBook(String keyword) {

        boolean found = false;

        for (Book b : books) {

            if (b.title.toLowerCase().contains(keyword.toLowerCase()) ||
                    b.author.toLowerCase().contains(keyword.toLowerCase())) {

                System.out.println(b);

                found = true;
            }
        }

        if (!found) {

            System.out.println("No matching books found!");
        }
    }

    // ISSUE BOOK
    @Override
    public void issueBook(int bookId, int memberId) {

        Book selectedBook = null;

        Member selectedMember = null;

        for (Book b : books) {

            if (b.id == bookId) {

                selectedBook = b;

                break;
            }
        }

        for (Member m : members) {

            if (m.memberId == memberId) {

                selectedMember = m;

                break;
            }
        }

        if (selectedBook == null) {

            System.out.println("Book not found!");

            return;
        }

        if (selectedMember == null) {

            System.out.println("Member not found!");

            return;
        }

        if (selectedBook.issued) {

            System.out.println("Book already issued!");

            return;
        }

        selectedBook.issued = true;

        transactions.add(new Transaction(bookId, memberId));

        System.out.println("Book issued successfully!");
    }

    // RETURN BOOK
    @Override
    public void returnBook(int bookId) {

        for (Book b : books) {

            if (b.id == bookId) {

                if (!b.issued) {

                    System.out.println("Book already available!");

                    return;
                }

                b.issued = false;

                for (Transaction t : transactions) {

                    if (t.bookId == bookId &&
                            t.returnDate == null) {

                        t.returnDate = LocalDate.now();

                        long days =
                                ChronoUnit.DAYS.between(
                                        t.issueDate,
                                        t.returnDate
                                );

                        if (days > 7) {

                            long fine = (days - 7) * 10;

                            System.out.println(
                                    "Late Fine = Rs." + fine
                            );
                        }

                        break;
                    }
                }

                System.out.println("Book returned successfully!");

                return;
            }
        }

        System.out.println("Book not found!");
    }

    // VIEW BOOKS
    @Override
    public void viewAllBooks() {

        if (books.isEmpty()) {

            System.out.println("No books available!");

            return;
        }

        books.sort(Comparator.comparing(book -> book.title));

        for (Book b : books) {

            System.out.println(b);
        }
    }

    // ADD MEMBER
    @Override
    public void addMember(Member member) {

        for (Member m : members) {

            if (m.memberId == member.memberId) {

                System.out.println("Member already exists!");

                return;
            }
        }

        members.add(member);

        System.out.println("Member added successfully!");
    }

    // VIEW MEMBERS
    @Override
    public void viewMembers() {

        if (members.isEmpty()) {

            System.out.println("No members found!");

            return;
        }

        for (Member m : members) {

            System.out.println(m);
        }
    }

    // VIEW TRANSACTIONS
    public void viewTransactions() {

        if (transactions.isEmpty()) {

            System.out.println("No transactions found!");

            return;
        }

        for (Transaction t : transactions) {

            System.out.println(t);
        }
    }

    // SAVE DATA
    @Override
    public void saveData() {

        try {

            ObjectOutputStream oos1 =
                    new ObjectOutputStream(
                            new FileOutputStream(BOOK_FILE)
                    );

            oos1.writeObject(books);

            oos1.close();

            ObjectOutputStream oos2 =
                    new ObjectOutputStream(
                            new FileOutputStream(MEMBER_FILE)
                    );

            oos2.writeObject(members);

            oos2.close();

            ObjectOutputStream oos3 =
                    new ObjectOutputStream(
                            new FileOutputStream(TRANSACTION_FILE)
                    );

            oos3.writeObject(transactions);

            oos3.close();

            System.out.println("Data saved successfully!");

        } catch (IOException e) {

            System.out.println("Error saving data!");
        }
    }

    // LOAD DATA
    @Override
    public void loadData() {

        try {

            ObjectInputStream ois1 =
                    new ObjectInputStream(
                            new FileInputStream(BOOK_FILE)
                    );

            books = (ArrayList<Book>) ois1.readObject();

            ois1.close();

            ObjectInputStream ois2 =
                    new ObjectInputStream(
                            new FileInputStream(MEMBER_FILE)
                    );

            members = (ArrayList<Member>) ois2.readObject();

            ois2.close();

            ObjectInputStream ois3 =
                    new ObjectInputStream(
                            new FileInputStream(TRANSACTION_FILE)
                    );

            transactions =
                    (ArrayList<Transaction>) ois3.readObject();

            ois3.close();

            System.out.println("Previous data loaded!");

        } catch (Exception e) {

            System.out.println("Fresh Library Started!");
        }
    }
}

// MAIN CLASS
public class AdvancedLibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        library.loadData();

        int choice;

        do {

            System.out.println("\n========= LIBRARY MENU =========");

            System.out.println("1. View All Books");

            System.out.println("2. Add Book");

            System.out.println("3. Remove Book");

            System.out.println("4. Search Book");

            System.out.println("5. Add Member");

            System.out.println("6. View Members");

            System.out.println("7. Issue Book");

            System.out.println("8. Return Book");

            System.out.println("9. View Transactions");

            System.out.println("10. Save Data");

            System.out.println("11. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    library.viewAllBooks();

                    break;

                case 2:

                    System.out.print("Enter Book ID: ");

                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Title: ");

                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");

                    String author = sc.nextLine();

                    System.out.print("Enter Category: ");

                    String category = sc.nextLine();

                    library.addBook(
                            new Book(id, title, author, category)
                    );

                    break;

                case 3:

                    System.out.print("Enter Book ID to remove: ");

                    int removeId = sc.nextInt();

                    library.removeBook(removeId);

                    break;

                case 4:

                    sc.nextLine();

                    System.out.print("Enter keyword: ");

                    String keyword = sc.nextLine();

                    library.searchBook(keyword);

                    break;

                case 5:

                    System.out.print("Enter Member ID: ");

                    int memberId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Member Name: ");

                    String memberName = sc.nextLine();

                    library.addMember(
                            new Member(memberId, memberName)
                    );

                    break;

                case 6:

                    library.viewMembers();

                    break;

                case 7:

                    System.out.print("Enter Book ID: ");

                    int bookId = sc.nextInt();

                    System.out.print("Enter Member ID: ");

                    int memId = sc.nextInt();

                    library.issueBook(bookId, memId);

                    break;

                case 8:

                    System.out.print("Enter Book ID to return: ");

                    int returnBookId = sc.nextInt();

                    library.returnBook(returnBookId);

                    break;

                case 9:

                    library.viewTransactions();

                    break;

                case 10:

                    library.saveData();

                    break;

                case 11:

                    library.saveData();

                    System.out.println("Exiting Program...");

                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 11);

        sc.close();
    }
}