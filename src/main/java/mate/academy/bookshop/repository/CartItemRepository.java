package mate.academy.bookshop.repository;

import mate.academy.bookshop.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByShoppingCartId(Long id);
}
