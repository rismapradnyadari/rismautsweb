<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class HomeController extends Controller
{
    public function index() 
    {

        $title ="Data Mahasiswa";
        $data['mahasiswa'] = array (
            'nim'=> '1915101052',
            'nama'=> 'Ni Luh Risma Pradnyadari'
        );    
        return view('admin.beranda',compact('title','data'));
    }

    public function dashboard()
    {
        $title = "UD.RISMA COMPUTER";

        return view ('admin.dashboard', compact('title'));
    }
}       