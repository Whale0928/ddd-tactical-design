package kitchenpos.menus.tobe.infra;

import kitchenpos.menus.tobe.domain.TobeMenu;
import kitchenpos.menus.tobe.domain.TobeMenuRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TobeJpaMenuRepository extends TobeMenuRepository, JpaRepository<TobeMenu, UUID> {
}
