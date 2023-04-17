package it.aulab.springbootcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import it.aulab.springbootcontroller.model.Comment;

/*
 * se insert la funzione deve ritornare void / Entità
 * se update la funzione deve ritornare int
 * se delete la funzione deve ritornare int
 */

public interface CommentRepository extends JpaRepository<Comment, Long> {
    
    @Modifying
    @Query("DELETE FROM Comment c WHERE c.email LIKE 'mirko%'")
    void deleteMirko();

    static Object countByPostId(Long id) {
        return null;
    }
    

}
