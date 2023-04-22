/**
 * 
 */
package com.mrojo.ta26ej1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ta26ej1.dto.Pieza;

/**
 * @author Marc
 *
 */
public interface PiezaDAO extends JpaRepository<Pieza, Long> {
	
}
