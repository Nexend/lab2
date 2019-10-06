package com.company;
import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;


public class FileCabinets {
    String author;
    String title;
    String status;

    Scanner scanner = new Scanner(System.in);

    private FileCabinet[] list;

    public FileCabinets(final int length){
        this.list = new FileCabinet[length];
    }

    public void add(final FileCabinet fileCabinet, final int position) {
        this.list[position-1] = fileCabinet;
    }

    public void infoAllBooks(){
        for (FileCabinet fileCabinet : this.list) {
            System.out.println("Название книги: " + fileCabinet.title + "\nАвтор: " + fileCabinet.author + "\nГод издания: " + fileCabinet.publishingYear + "\nИздательство: " + fileCabinet.publishingHouse + "\nЦена: " + fileCabinet.price + "\nСостояние: " + fileCabinet.status + "\nДата выдачи читателю на руки: " + fileCabinet.dateIssued + '\n');
        }
        backToMenu();
    }
    public void changeStateOfBooks() {
        System.out.println("Введите книгу, которой хотите поменять состояние: ");
        title = scanner.next();
        scanner.nextLine();
        for ( FileCabinet fileCabinet : this.list) {
            if (fileCabinet.publishingYear <= 1989) {
                System.out.println("Введите новое состояние книги: ");
                fileCabinet.status = scanner.nextLine();
                System.out.println("Состояние изменено");
            }
            break;
        }

        backToMenu();
    }
    public void booksCostMoreThanOneHundred() {
        for ( FileCabinet fileCabinet : this.list ) {
            if (fileCabinet.price >= 100) {
                System.out.println("Название книги: " + fileCabinet.title + "\nЦена: " + fileCabinet.price);
            }
        }
        backToMenu();
    }

    public void booksThisAuthor() {
        System.out.println("Введите имя автора: ");
        author = scanner.next();
        for ( int i = 0; i < this.list.length; i++ ) {
            if(author.equals(this.list[i].author)) {
                System.out.println("Название книги: " + this.list[i].title);
            }
        }

        backToMenu();
    }
int dateIssued;
    public void infoBooksOnHands() {
        LocalDate today = LocalDate.now( ZoneId.of( "America/Montreal" ) );
        LocalDate threeMonthsAgo = today.minusMonths( 3 );
        for ( FileCabinet fileCabinet : this.list ) {
                System.out.println("Название книги: " + fileCabinet.title);
        }
        backToMenu();
    }

    public void backToMenu(){
        int result = -1;
        while (result<0||result>1) {
            System.out.println('\n' + "Вернуться в меню? (1 - да, 0 - нет)");
            result = Integer.parseInt(scanner.next());
            if (result == 1) {
                Main.Menu();
            }
        }
    }
}
