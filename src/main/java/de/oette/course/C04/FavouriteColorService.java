package de.oette.course.C04;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class FavouriteColorService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public FavouriteColor storeColor(String colorName) {
        FavouriteColor fColor = new FavouriteColor(colorName);
        entityManager.persist(fColor);
        return fColor;
    }

    @Transactional
    public List<FavouriteColor> loadColors() {
        String queryString = "select favouriteColor from FavouriteColor favouriteColor";
        TypedQuery<FavouriteColor> query = entityManager.createQuery(queryString, FavouriteColor.class);

        return query.getResultList();
    }
}
