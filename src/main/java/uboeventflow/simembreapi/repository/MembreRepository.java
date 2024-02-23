package uboeventflow.simembreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uboeventflow.simembreapi.entity.Membre;

import java.util.UUID;

public interface MembreRepository extends JpaRepository<Membre, UUID> {
  // Ici, vous pouvez définir des méthodes pour des requêtes personnalisées si nécessaire
}

