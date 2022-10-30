package com.mercadona.pruebaFWK.business.dao.impl;

import org.springframework.stereotype.Component;

import com.mercadona.pruebaFWK.business.dao.DestinoDaoInterface;
import com.mercadona.pruebaFWK.business.domain.Destino;
import com.mercadona.pruebaFWK.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

@Component
public class DestinoDaoImpl implements DestinoDaoInterface {

	@Override
	public Destino getDestinoById(int id) {
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			Destino destino = session.find(Destino.class, id);
			
        	return destino;
        	
        } catch (Exception e) {
        	
            e.printStackTrace();
            
        }
        return null;
	}

	@Override
	public Long create(Destino destino) {
		Transaction transaction = null;
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	
            transaction = session.beginTransaction();
            session.saveOrUpdate(destino);
            transaction.commit();
            return destino.getId();
            
        } catch (Exception e) {
        	
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return -1L;
	}

	@Override
	public boolean update(Destino destino) {
		Transaction transaction = null;
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	
            transaction = session.beginTransaction();
            session.saveOrUpdate(destino);
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
	public boolean delete(Destino destino) {
		Transaction transaction = null;
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	
            transaction = session.beginTransaction();
            session.saveOrUpdate(destino);
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

}
