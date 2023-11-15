/**
 * 
 */
package com.bandiClasses.DMS.repository;
/**
* @author Swarupa Jinne
* S558943
*/

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Trainer;

/**
 * @author Swarupa Jinne
 * Nov 13, 2023
 */
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
	

}
