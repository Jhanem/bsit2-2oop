    import java.util.*;

    public class LibraryManager {

        private List<String> books;

        public LibraryManager(List<String> initialBooks) {
            this.books = initialBooks;
        }

        public void showBooks() {
            System.out.println("\n--- Current Books ---");
            try {
                if (books == null) {
                    throw new IllegalStateException("Book list is null. Cannot display books.");
                }

                if (books.isEmpty()) {
                    System.out.println("The library has no books.");
                } else {
                    System.out.println("Current books in the library:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println("[" + i + "] " + books.get(i));
                    }
                }
            } catch (IllegalStateException e) {
                System.err.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Display operation completed.");
            }
        }

        public void addBook(Scanner scanner) {
            System.out.println("\n--- Adding a New Book ---");
            try {
                System.out.print("Enter book title to add: ");
                String title = scanner.nextLine();

                if (title == null || title.trim().isEmpty()) {
                    throw new IllegalArgumentException("Book title cannot be empty!");
                }
                if (title.trim().length() < 3) {
                    throw new IllegalArgumentException("Book title must be at least 3 characters long!");
                }

                books.add(title.trim());
                System.out.println("Book '" + title.trim() + "' added successfully!");
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Add book operation completed.");
                showBooks();
            }
        }

        public void removeBook(Scanner scanner) {
            System.out.println("\n--- Removing a Book ---");
            if (books.isEmpty()) {
                System.out.println("Cannot remove a book. The library is empty.");
                return;
            }

            try {
                System.out.print("Enter book number to remove (1-" + books.size() + "): ");
                int index = scanner.nextInt();

                if (index < 1 || index > books.size()) {
                    throw new IndexOutOfBoundsException("Invalid book number! Please enter between 1 and " + books.size() + ".");
                }
                
                String removedBook = books.remove(index - 1);
                System.out.println("Book '" + removedBook + "' removed successfully!");

            } catch (InputMismatchException e) {
                System.err.println("Error: Please enter a valid number!");
                scanner.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Remove book operation completed.");
                showBooks();
            }
        }

        public static class Main {
            public static void main(String[] args) {
                List<String> booksList = new ArrayList<>();
                booksList.add("Java Programming");
                booksList.add("Web Development");
                booksList.add("Database Design");

                LibraryManager libraryManager = new LibraryManager(booksList);
                libraryManager.showBooks();
                
                Scanner scanner = new Scanner(System.in);

                libraryManager.addBook(scanner);
                libraryManager.removeBook(scanner);

                scanner.close();
            }
        }
    }
