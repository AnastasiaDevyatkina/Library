public class Main {

    public static void main(String[] args) {
        Book book = new Book("Зеленая Миля");
        Bookmover fromArchivedStatusMoved = new FromArchivedStatusMoved();
        Bookmover fromAvailableStatusMoved = new FromAvailableStatusMoved();
        Bookmover fromBorrowedStatusMoved = new FromBorrowedStatusMoved();
        Bookmover fromOverduedStatusMoved = new FromOverduedStatusMoved();

        fromAvailableStatusMoved.moveToStatus(book, Status.ARCHIVED);
        fromArchivedStatusMoved.moveToStatus(book, Status.OVERDUED);
        fromArchivedStatusMoved.moveToStatus(book, Status.AVAILABLE);
        fromAvailableStatusMoved.moveToStatus(book, Status.BORROWED);
        fromBorrowedStatusMoved.moveToStatus(book, Status.OVERDUED);
        fromOverduedStatusMoved.moveToStatus(book, Status.AVAILABLE);
    }
}