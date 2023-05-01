package com.education.demoeducation;
import com.education.edatabase.Book;
import org.junit.Test;
import com.education.edao.BookLibDao;
import com.education.eservice.impl.BookLibService;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BookLibServiceTest {
    @Autowired
    BookLibService libService;

    @Mock
    BookLibDao libDao;

    @Test
    public void  display(){
        System.out.println("this is test");
        List<Book> display = libService.display();
        System.out.println(display.size());

    }
}
