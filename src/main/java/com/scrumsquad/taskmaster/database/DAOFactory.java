package com.scrumsquad.taskmaster.database;

import com.scrumsquad.taskmaster.database.concepto.ConceptoDAO;
import com.scrumsquad.taskmaster.database.concepto.ConceptoDAOImp;
import com.scrumsquad.taskmaster.database.definicion.DefinicionDAOImp;

public class DAOFactory {

    private DAOFactory() {}

    public static ConceptoDAO getConceptoDAO() {
        return new ConceptoDAOImp();
    }

    public static DefinicionDAOImp getDefinicionesDAO() {
        return new DefinicionDAOImp();
    }

}
