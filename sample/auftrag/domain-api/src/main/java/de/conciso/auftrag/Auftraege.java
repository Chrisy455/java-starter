package de.conciso.auftrag;

import java.util.List;
import java.util.Optional;

public interface Auftraege {
  Auftrag create(Auftrag auftrag);
  Optional<Auftrag> findById(int id);
  List<Auftrag> findAll();
}
