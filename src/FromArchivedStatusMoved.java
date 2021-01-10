public class FromArchivedStatusMoved extends Bookmover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE:
                book.setStatus(Status.AVAILABLE);
                break;
            default:
                System.out.println("Перевод книги из статуса ARCHIVED в статус " + requestedStatus + "невозможен");
        }

        System.out.println("Статус книги: " + book.getStatus());
    }
}