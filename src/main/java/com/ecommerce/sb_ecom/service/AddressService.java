package com.ecommerce.sb_ecom.service;

import com.ecommerce.sb_ecom.model.AddressDTO;
import com.ecommerce.sb_ecom.model.User;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);
}
