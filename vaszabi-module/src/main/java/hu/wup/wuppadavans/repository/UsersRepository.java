package hu.wup.wuppadavans.repository;


import hu.wup.wuppadavans.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity,Long> {
}