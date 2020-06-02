package com.dukcapil.webservice.service.impl;

import com.dukcapil.webservice.dto.*;
import com.dukcapil.webservice.service.DukcapilService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.jaxb.SpringDataJaxb.PageDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import static java.util.stream.Collectors.toList;

/*
 * @author by Johannes Agus Subagio
 * 02/06/2020 10:31
 */
@Service
public class DukcapilServiceImpl implements DukcapilService {

    @Override
    public Page<Response> getData(Request request, Pageable pageable) {

//        String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
//        String IP_REGEXP = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
//
//        List<Response> responseList = new ArrayList<>();
//
//        if (request.getNik().equals("1401010101120291") && request.getUserid().equals("teravin")
//                && request.getPassword().equals("P@ssw0rd") && request.getIP_USER().equals("127.0.0.1")) {
//            Response dataResponses = new Response();
////            dataResponses.setNO_KK("1401010101010303");
////            dataResponses.setNIK("1401010101120291");
////            dataResponses.setNamaLengkap("ZIKRI NURHIDAYAT");
////            dataResponses.setKabName("KAMPAR");
////            dataResponses.setAgama("ISLAM");
////            dataResponses.setNoRW("16");
////            dataResponses.setKecName("BANGKINANG KOTA");
////            dataResponses.setJenisPkrjn("PELAJAR/MAHASISWA");
////            dataResponses.setNoRT("2");
////            dataResponses.setNoKel("1013");
////            dataResponses.setAlamat("JL. SUNGKAI KAMPAR");
////            dataResponses.setNoKec("1");
////            dataResponses.setTmptLhr("BANGKINANG");
////            dataResponses.setPddkAkh("SLTA/SEDERAJAT");
////            dataResponses.setStatusKawin("BELUM KAWIN");
////            dataResponses.setStatusHbKel("ANAK");
////            dataResponses.setNoProp("14");
////            dataResponses.setNamaLgkpIbu("NURHAYATI");
////            dataResponses.setNamaLgkpAyah("RONI");
////            dataResponses.setPropName("RIAU");
////            dataResponses.setNoKab("1");
////            dataResponses.setKelName("LANGGINI");
////            dataResponses.setJenisKlmin("Laki-Laki");
////            dataResponses.setTglLahir("1990-02-12");
////
////            responseList.add(dataResponses);
//
//            Page<Response> responsePage = new PageImpl<Response>(responseList, pageable, responseList.size());
//        } else if (request.getNik().equals("140140140140140") && request.getUserid().equals("teravin")
//                && request.getPassword().equals("P@ssw0rd") && request.getIP_USER().equals("127.0.0.1")) {
//
//            HashMap<String, String> stringHashMap = new HashMap<>();
//            stringHashMap.put("RESPON", "Data Tidak Ditemukan");
//
//            List<String> stringList = new ArrayList<>();
//            stringList.add(stringHashMap.toString());
//
//            Page<String> responses = new PageImpl<String>(stringList, pageable, responseList.size());
//
//        } else if (request.getNik().equals("1401010101120291") && request.getUserid().equals("webServiceTeravin")
//                && request.getPassword().equals("pwd") && request.getIP_USER().equals("127.0.0.1")) {
//
//            HashMap<String, String> stringHashMap = new HashMap<>();
//            stringHashMap.put("RESPON", "Login Gagal");
//
//            List<String> stringList = new ArrayList<>();
//            stringList.add(stringHashMap.toString());
//
//            Page<String> responses = new PageImpl<String>(stringList, pageable, responseList.size());
//        } else if (request.getNik().equals("1401010101120291") && request.getUserid().equals("webServiceTeravin")
//                && request.getPassword().equals("pwd") && request.getIP_USER().equals("103.194.171.205")) {
//
//            HashMap<String, String> stringHashMap = new HashMap<>();
//            stringHashMap.put("RESPON", "IP Client Tidak Terdaftar");
//
//            List<String> stringList = new ArrayList<>();
//            stringList.add(stringHashMap.toString());
//
//            Page<String> responses = new PageImpl<String>(stringList, pageable, responseList.size());
//        } else if (request.getNik().equals("1401010101120291") && request.getUserid().equals("webServiceTeravin")
//                && request.getPassword().equals("pwd") && request.getIP_USER().equals(IP_REGEXP)) {
//
//            HashMap<String, String> stringHashMap = new HashMap<>();
//            stringHashMap.put("RESPON", "IP Address Tidak Sesuai");
//
//            List<String> stringList = new ArrayList<>();
//            stringList.add(stringHashMap.toString());

//            Page<String> responses = new PageImpl<String>(stringList, pageable, responseList.size());
//        }

        return null;

    }

    @Override
    public Page<ResponseTwo> getSomething(Request request, Pageable pageable) {
        List<HashMap<String,String>> somethings = new ArrayList<>();
        if ("1".equals(request.getNik())) {
            List<ResponseTwo> responseList = new ArrayList<>();
            Response dataResponses = new Response();
            dataResponses.setNO_KK("1401010101010303");
            dataResponses.setNIK("1401010101120291");
            dataResponses.setNamaLengkap("ZIKRI NURHIDAYAT");
            dataResponses.setKabName("KAMPAR");
            dataResponses.setAgama("ISLAM");
            dataResponses.setNoRW("16");
            dataResponses.setKecName("BANGKINANG KOTA");
            dataResponses.setJenisPkrjn("PELAJAR/MAHASISWA");
            dataResponses.setNoRT("2");
            dataResponses.setNoKel("1013");
            dataResponses.setAlamat("JL. SUNGKAI KAMPAR");
            dataResponses.setNoKec("1");
            dataResponses.setTmptLhr("BANGKINANG");
            dataResponses.setPddkAkh("SLTA/SEDERAJAT");
            dataResponses.setStatusKawin("BELUM KAWIN");
            dataResponses.setStatusHbKel("ANAK");
            dataResponses.setNoProp("14");
            dataResponses.setNamaLgkpIbu("NURHAYATI");
            dataResponses.setNamaLgkpAyah("RONI");
            dataResponses.setPropName("RIAU");
            dataResponses.setNoKab("1");
            dataResponses.setKelName("LANGGINI");
            dataResponses.setJenisKlmin("Laki-Laki");
            dataResponses.setTglLahir("1990-02-12");

            HashMap<String, Object> response1 = new LinkedHashMap<>();
            response1.put("", dataResponses);
            ResponseTwo responseTwo = new ResponseTwo();
            responseTwo.setDetails(response1);
            responseList.add(responseTwo);
            return new PageImpl<>(responseList, pageable, responseList.size());
        } else if ("2".equals(request.getNik())) {

        } else if ("3".equals(request.getNik())) {

        } else if ("4".equals(request.getNik())) {

        } else {
            List<ResponseTwo> responseList = new ArrayList<>();
            NotFound notFound = new NotFound();
            notFound.setRESPON("Data tidak ditemukan");
            HashMap<String, Object> response2 = new LinkedHashMap<>();
            response2.put("", notFound);
            ResponseTwo responseTwo = new ResponseTwo();
            responseTwo.setDetails(response2);
            responseList.add(responseTwo);
            return new PageImpl<ResponseTwo>(responseList, pageable, responseList.size());
        }

        return null;
    }

    @Override
    public Page<HashMap<String, String>> getAnything(Request request, Pageable pageable) {
        if ("1".equals(request.getNik())) {
            List<HashMap<String,String>> responseList = new ArrayList<>();
            HashMap<String, String> response = new HashMap<>();
            response.put("NO_KK","1401010101010303");
            response.put("NIK","1401010101120291");
            response.put("NAMA_LENGKAP","ZIKRI NURHIDAYAT");

            responseList.add(response);
            return new PageImpl<>(responseList, pageable, responseList.size());
        } else if ("2".equals(request.getNik())) {

        } else if ("3".equals(request.getNik())) {

        } else if ("4".equals(request.getNik())) {

        } else {
            List<HashMap<String,String>> responseList = new ArrayList<>();
            HashMap<String, String> response = new HashMap<>();
            response.put("RESPON","Data Tidak Ditemukan!");

            responseList.add(response);
            return new PageImpl<>(responseList, pageable, responseList.size());
        }

        return null;
    }

}
