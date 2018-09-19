package con.learning.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sample.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
