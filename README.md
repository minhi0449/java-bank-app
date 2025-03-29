# Java Bank App
> `Eclipse IDE` 로 개발된 자바 콘솔 기반 '은행 계좌 관리' 시스템

## ✓ 프로젝트 개요
이 프로젝트는 자바 기초 학습을 위한 간단한 은행 계좌 관리 시스템으로, 계좌 생성, 조회, 입금, 출금 기능을 제공합니다.

 
<h2>✓ 개발 환경</h2>
<div align="left">
  <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Eclipse_IDE-2C2255?style=for-the-badge&logo=eclipse&logoColor=white" alt="Eclipse IDE" />
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub" />
</div>

## ✓ 핵심 기능
• **계좌 생성** : 계좌번호, 예금주, 초기 잔액 정보를 입력하여 새 계좌 생성 </br>
- **계좌 목록 조회** : 모든 계좌 정보 확인 </br>
• 입금 기능 : 계좌번호를 입력하여 금액을 입금 </br>
• 출금 기능 : 계좌번호를 입력하여 금액을 출금 </br>

## 기능

- 계좌 생성: 계좌번호, 예금주, 초기 잔액 정보로 새 계좌 생성
- 계좌 목록 조회: 모든 계좌 정보 확인
- 예금: 계좌번호로 계좌를 찾아 입금 처리
- 출금: 계좌번호로 계좌를 찾아 출금 처리

## 개발 환경

- Java SE Development Kit (JDK) 8 이상
- Eclipse IDE
- 외부 라이브러리 없음 (순수 자바만 사용)


# java-bank-app

Eclipse IDE로 개발된 자바 콘솔 기반 은행 계좌 관리 시스템입니다.

## 프로젝트 개요

이 프로젝트는 자바 기초 학습을 위한 간단한 은행 계좌 관리 시스템으로, 계좌 생성, 조회, 입금, 출금 기능을 제공합니다.

## 기능

- 계좌 생성: 계좌번호, 예금주, 초기 잔액 정보로 새 계좌 생성
- 계좌 목록 조회: 모든 계좌 정보 확인
- 예금: 계좌번호로 계좌를 찾아 입금 처리
- 출금: 계좌번호로 계좌를 찾아 출금 처리

## 개발 환경

- Java SE Development Kit (JDK) 8 이상
- Eclipse IDE
- 외부 라이브러리 없음 (순수 자바만 사용)

## 실행 방법

### Eclipse에서 실행하기
1. 프로젝트를 Eclipse로 가져오기 (Import) → Import → General → Projects from Folder or Archive
2. 프로젝트를 선택한 후 마우스 우클릭 → Run As → Java Application
3. BankApp 클래스를 선택하여 실행

### JAR 파일로 실행하기
1. Eclipse에서 프로젝트 우클릭 → Export → Java → Runnable JAR file
2. Launch configuration에서 BankApp 선택
3. 내보내기 위치 지정 후 Finish
4. 명령 프롬프트(CMD)에서 다음 명령어 실행:
