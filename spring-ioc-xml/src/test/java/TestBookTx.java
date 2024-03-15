import com.itguigu.spring6.iocxml.tx.controller.BookController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean-jdbc.xml")
public class TestBookTx {
    @Autowired
    private BookController bookController;
//
//    @ParameterizedTest
//    @CsvSource("1,1")
//    public void testBookTx(int bookId, int userId) {
//        bookController.buyBook(bookId, userId);
//    }
//
//    @ParameterizedTest
//    @CsvSource("2,2")
//    public void testBookTx1(int bookId, int userId) {
//        bookController.buyBook(bookId, userId);
//    }


}
