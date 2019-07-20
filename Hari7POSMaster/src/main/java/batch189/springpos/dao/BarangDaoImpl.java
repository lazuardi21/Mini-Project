package batch189.springpos.dao;


import org.springframework.stereotype.Repository;

import batch189.springpos.model.Barang;

@Repository
public class BarangDaoImpl extends AbstractHibernateDao<Barang> implements BarangDao {

	public BarangDaoImpl () {
		setClazz(Barang.class);
	}

}
