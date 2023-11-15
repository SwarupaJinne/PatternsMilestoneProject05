/**
 * 
 */
package com.bandiClasses.DMS.repository;
/**
* @author Swarupa Jinne
* S558943
*/

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

/**
 * @author Swarupa Jinne
 * Nov 12, 2023
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
	
	

}