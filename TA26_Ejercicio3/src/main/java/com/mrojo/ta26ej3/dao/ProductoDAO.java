/**
 * 
 */
package com.mrojo.ta26ej3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ta26ej3.dto.Producto;

/**
 * @author Marc
 *
 */
public interface ProductoDAO extends JpaRepository<Producto, Long> {

}
