package tacos.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tacos.Taco;

@Repository
public interface TacoRepository 
         extends PagingAndSortingRepository<Taco, Long> {

}
