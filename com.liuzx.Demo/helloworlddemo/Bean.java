package helloworlddemo;

public class Bean {

	public static void main(String[] args) {
		Person person = new Person("liuzx", 28);
		Book book = new Book("梦里花落知多少", "88");
		person.setBook(book);
		book.setPerson(person);
		System.out.println(book.toString());
		System.out.println(person.getName() + person.getAge() + person.getBook().getName());
		System.out.println(book.getName() + book.getPrice() + book.getPerson().getName());

	}

}
