public class Main {
    public static void main(String[] args) {
        Author authorDenisKolisnichenko = new Author("Денис", "Количниченко");
        Author authorPolTronkon = new Author("Пол", "Тронкон");
        Author authorLourensFridman = new Author("Лоуренс", "Фридмэн");
        Book bookWindows = new Book("Самоучитель Microsoft Windows 10", "2016", authorDenisKolisnichenko);
        Book bookBash = new Book("Bash и кибербезопастность", "2019", authorPolTronkon);
        Book bookLaws = new Book("Введение в американское право", "1992", authorLourensFridman);
        System.out.println(bookWindows.getYear());
        bookWindows.setYear("2023");
        System.out.println(bookWindows.getYear());
    }
}