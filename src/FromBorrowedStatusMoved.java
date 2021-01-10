public class FromBorrowedStatusMoved extends Bookmover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED:
                book.setStatus(Status.ARCHIVED);
                break;
            case AVAILABLE:
                book.setStatus(Status.AVAILABLE);
                break;
            case OVERDUED:
                book.setStatus(Status.OVERDUED);
                break;
            case BORROWED:
                System.out.println("Книга уже имеет это статус");
        }

        System.out.println("Статус книги: " + book.getStatus());
    }
}