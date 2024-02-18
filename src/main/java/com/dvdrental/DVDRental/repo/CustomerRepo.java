package com.dvdrental.DVDRental.repo;

import com.dvdrental.DVDRental.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
//    @Query(value = "select customers from Customer customers where customer.firstName like '%:name%'")
//    List<Customer> getCustomersByFirstName(@Param("name") String firstName);

//    @Query(value = "select" +
//            " customer_id as customerId," +
//            " store_id as storeId," +
//            " first_name as firstName," +
//            " last_name as lastName," +
//            " email as email," +
//            " address_id as addressId," +
//            " activebool as activeBool," +
//            " create_date as createDate," +
//            " last_update as lastUpdate," +
//            " active as active," +
//            " address_id as address from public.customer where customer.first_name like(:name)", nativeQuery = true)
//
////    @Query(value = "select * from public.customer where customer.first_name like(:name)", nativeQuery = true)
//    List<Customer> getCustomersByFirstName(@Param("name") String firstName);

//    @Query(value = "select" +
//            " customer_id," +
//            " store_id," +
//            " first_name," +
//            " last_name," +
//            " email," +
//            " address_id," +
//            " activebool," +
//            " create_date," +
//            " last_update," +
//            " active from public.customer where customer.first_name like(:name)", nativeQuery = true)
//    List<Customer> getCustomersByFirstName(@Param("name") String firstName);

//    @Query(value = "select" +
//            " customer_id as customerId," +
//            " store_id as storeId," +
//            " first_name as firstName," +
//            " last_name as lastName," +
//            " email as email," +
//            " address_id as addressId," +
//            " activebool as activeBool," +
//            " create_date as createDate," +
//            " last_update as lastUpdate," +
//            " active as active from public.customer where customer.first_name like(:name)", nativeQuery = true)
//    List<Customer> getCustomersByFirstName(@Param("name") String firstName);

    @Query(value = "select" +
            " customer_id as customerId," +
            " store_id as storeId," +
            " first_name as firstName," +
            " last_name as lastName," +
            " email as email," +
            " address_id as addressId," +
            " activebool as activeBool," +
            " create_date as createDate," +
            " last_update as lastUpdate," +
            " active as active from public.customer where customer.first_name like(:name)", nativeQuery = true)
    List<Customer> getCustomersByFirstName(@Param("name") String firstName);

//    предложил чат GPT до этого был верхний запрос
}
