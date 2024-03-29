-- 코드를 입력하세요
-- MCDP_CD 진교과코드 CS, GS
-- 고용일자 내침차순, 이름 오른차순

SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, "%Y-%m-%d") as HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME;