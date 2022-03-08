package com.zupedu.estabelecimentos.unidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UnidadeRepository extends JpaRepository<Unidade, Long> {
}
