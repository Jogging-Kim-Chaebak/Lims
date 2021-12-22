package com.puppy.client.mypage.dao;

import java.util.List;

import com.puppy.common.vo.PetVO;

public interface MypageDAO {
	public List<PetVO> petList();
	public int petInsert(PetVO pvo);
	public PetVO petDetail(PetVO pvo);
	public int petUpdate(PetVO pvo);
	public int petDelete(int p_no);
}
