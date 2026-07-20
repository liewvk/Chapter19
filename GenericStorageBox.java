public class GenericStorageBox {

    static class StorageBox<T> {
        private T item;

        public void store(T item) {
            this.item = item;
            System.out.println("Item stored successfully.");
        }

        public T retrieve() {
            return item;
        }

        public boolean isEmpty() {
            return item == null;
        }

        public void displayItem() {
            if (isEmpty()) {
                System.out.println("Storage box is empty.");
            } else {
                System.out.println("Stored item: " + item);
            }
        }
    }

    public static void main(String[] args) {
        StorageBox<String> bookBox = new StorageBox<>();
        bookBox.store("Java 2026 Made Easy");
        bookBox.displayItem();

        System.out.println();

        StorageBox<Integer> numberBox = new StorageBox<>();
        numberBox.store(100);
        numberBox.displayItem();
    }
}
