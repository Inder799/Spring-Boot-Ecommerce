package com.ecommerce.sb_ecom.service;

import com.ecommerce.sb_ecom.payload.AddressDTO;
import com.ecommerce.sb_ecom.model.User;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);

    List<AddressDTO> getAllAddresses();

    AddressDTO getAddressById(Long addressId);

    List<AddressDTO> getAllAddressesByUser(User user);

    AddressDTO updateAddress(AddressDTO addressDTO, Long addressId);

    String deleteAddress(Long addressId);
}
