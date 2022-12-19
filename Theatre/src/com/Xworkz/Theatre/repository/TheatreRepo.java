package com.Xworkz.Theatre.repository;

import java.util.ArrayList;

import com.Xworkz.Theatre.TheatreDTO;

public interface TheatreRepo {
    ArrayList<TheatreDTO> save(TheatreDTO dto);
    ArrayList<TheatreDTO> read(TheatreDTO dto);
    
}



