package model;

public interface ORMmodel {

    /**
     * Method which performs actual SQL SELECT LIMIT 1
     *
     * */
    ORMmodel fetch(String id);
    /**
     * Method which performs actual SQL INSERT
     *
     * */
    void save();

    /**
     * Method which performs actual SQL UPDATE
     *
     * */
    ORMmodel update(String... fields);

    /**
     * Method which performs actual SQL DELETE
     *
     * */
    ORMmodel delete(String... fields);


}
