package model;

public interface ORM_Model {

    /**
     * Method which performs actual SQL SELECT LIMIT 1
     *
     * */
    ORM_Model fetch(String id);
    /**
     * Method which performs actual SQL INSERT
     *
     * */
    void save();

    /**
     * Method which performs actual SQL UPDATE
     *
     * */
    ORM_Model update(String... fields);

    /**
     * Method which performs actual SQL DELETE
     *
     * */
    ORM_Model delete(String... fields);


}
