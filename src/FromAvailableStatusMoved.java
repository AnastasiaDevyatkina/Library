public class FromAvailableStatusMoved extends Bookmover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {

        switch (requestedStatus) {
            case ARCHIVED:
                book.setStatus(Status.ARCHIVED);
                break;
            default:
                System.out.println("Перевод книги из статуса" + book.status + " в статус" + requestedStatus + "невозможен");
        }

        System.out.println("Статус книги: " + book.getStatus());
    }
}