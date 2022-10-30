package com.mercadona.pruebaFWK.business.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.mercadona.pruebaFWK.business.dao.ProductoDaoInterface;
import com.mercadona.pruebaFWK.business.domain.Producto;
import com.mercadona.pruebaFWK.util.HibernateUtil;

@Component
public class ProductoDaoImpl implements ProductoDaoInterface {


	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> getProductoByEAN(Long codigo, Long codigoProvedor, Long idDestino) {
		
		List<Producto> respuesta;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			Query query = session.createNamedQuery( "Producto.GetByEAN" );
			query.setParameter("codigo",codigo);
			query.setParameter("codigoProvedor",codigoProvedor);
			query.setParameter("idDestino",idDestino);
			
			respuesta = query.getResultList();
			
        	return respuesta;
        	
        } catch (Exception e) {
        	
            e.printStackTrace();
            
        }
        return null;
	}

	@Override
	public Producto create(Producto producto) {
		
		Transaction transaction = null;
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	
            transaction = session.beginTransaction();
            session.saveOrUpdate(producto);
            transaction.commit();
            
            return producto;
            
        } catch (Exception e) {
        	
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public boolean update(Producto producto) {
		
		Transaction transaction = null;
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	
            transaction = session.beginTransaction();
            session.saveOrUpdate(producto);
            transaction.commit();
            return true;
            
        } catch (Exception e) {
        	
            if (transaction != null) {
                transaction.rollback();
            }
            
            e.printStackTrace();
        }
        return false;
	}

	@Override
	public boolean delete(Producto producto) {
		
		Transaction transaction = null;
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	
            transaction = session.beginTransaction();
            session.saveOrUpdate(producto);
            transaction.commit();
            return true;
            
        } catch (Exception e) {
        	
            if (transaction != null) {
                transaction.rollback();
            }
            
            e.printStackTrace();
        }
        return false;
	}

	@Override
	public Producto getProductoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
