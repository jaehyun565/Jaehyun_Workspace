package D2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swexpert_14229_백만개의정수정렬 {
	static int[] arr;

	public static void main(String[] args) throws IOException {		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[st.countTokens()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
//		sortBubble(arr);
//		sortSelection(arr);
//		sortCounting(arr);
// 		sortInsertion(arr);
//		sortMerge(arr, 0, arr.length - 1);
//		sortQuickHoare(arr, 0, arr.length - 1);
		sortQuickLomuto(arr, 0 , arr.length-1);
		System.out.println(arr[500000]);
	}

	// 버블 정렬
	// 제일 왼쪽 수를 잡아서 옆자리수와 비교해서 swap idx를 하나씩 추가하면서 제일 오른쪽 까지 가면서 swap.
	// 한 싸이클이 끝난 후에는 가장 오른쪽에 가장 큰수가 위치
	// 싸이클마다 endpoint를 하나씩 줄여가면서 swap하면 될 것 같다.
	public static void sortBubble(int[] arr) {
		int idx = 0;
		int i = 0;
		while (i < arr.length) {
			for (idx = 0; idx < arr.length - 1 - i; idx++) {
				if (arr[idx] > arr[idx + 1]) {
					int tmp = arr[idx];
					arr[idx] = arr[idx + 1];
					arr[idx + 1] = tmp;
				}
			}
			i++;
		}

		return;
	}

	// 선택정렬
	// 탐색해서 최솟값을 가장 왼쪽으로 이동시킨다.
	// 그 다음 수부터는 left point를 하나씩 올리면서 정렬하면 될듯.
	//
	public static void sortSelection(int[] arr) {
		int i = 0;
		int idx = 0;
		while (i < arr.length) {
			int min = Integer.MAX_VALUE;
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = min;
			arr[idx] = tmp;
			i++;
		}
	}

	// 카운팅 정렬
	// 배열의 가장 큰 수를 알고 정수일 때만 사용가능, 전체 배열갯수+1만큼의 카운팅 배열을 만든다.
	// 배열을 순회하면서 숫자가 나오면 해당 카운팅 배열의 인덱스에 맞춰 수를 증가시킨다.
	// 카운팅 배열을 누적합으로 만들어준다.
	// 카운팅 배열을 받을 임시배열을 하나 만들어준다.
	// 원본 배열의 마지막 수 부터 읽어주면서, 누적합 배열의 수를 하나 줄이고, 그 인덱스에 해당 숫자를 삽입한다.

	public static void sortCounting(int[] arr) {
		int[] count = new int[1000001];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		int[] sortedArr = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			sortedArr[--count[arr[i]]] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sortedArr[i];
		}

	}

	// 삽입정렬
	// 정렬된 집합 S 와 , 정렬되지 않은 집합 U 2개로 나눔
	// 배열에서 첫 번째 원소는 정렬된 집합, 나머지는 정렬되지 않은 집합에 넣고, U의 첫번째 원소부터 S의 원소와 비교해서 정렬하기
	// U의 원소들을 하나씩 빼서 S에 다 넣으면 정렬끝.
	public static void sortInsertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] <= arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					// break;
				}
			}
		}

	}

	// 병합정렬 -> 재귀활용
	// 배열을 1/2씩 나눠서 최소단위로 쪼갠다. 임시 정렬배열을 만든다.
	// 각 단위에 인덱스 i, j 로 비교하면서 작은 숫자는 임시배열에 넣고, 인덱스를 올린다. 그렇게 인덱스가 단위의 범위를 벗어날 때까지
	// 반복하고 벗어나면 반대쪽 인덱스의 원소들을 다 추가
	// 이를 단위를 합쳐가면서 최종 배열이 완성될 때까지 반복한다.
	public static void sortMerge(int[] arr, int left, int right) {
		// base case
		if (left < right) {
			int mid = (left + right) / 2;
			// recursive case -> 분할파트
			sortMerge(arr, left, mid);
			sortMerge(arr, mid + 1, right);

			// 병합파트
			int L = left;
			int R = mid + 1;
			int idx = left;
			int[] sortedArr = new int[arr.length];

			while (L <= mid && R <= right) {
				if (arr[L] <= arr[R]) {
					sortedArr[idx++] = arr[L++];
				} else {
					sortedArr[idx++] = arr[R++];
				}
			}
			// 아직 왼쪽이 남아있다면?
			if (L <= mid) {
				for (int i = L; i <= mid; i++) {
					sortedArr[idx++] = arr[i];
				}
			} else {
				for (int i = R; i <= right; i++) {
					sortedArr[idx++] = arr[i];
				}
			}

			// 원본에 반영하기
			for (int i = left; i <= right; i++) {
				arr[i] = sortedArr[i];
			}
		}
	}

	// 퀵정렬
	// 배열과 피벗이 존재한다.
	// 피벗보다 작은 값은 왼쪽, 큰 값을 오른쪽에 위치시켜서 정렬시키는 것이 기본 골자
	// 피벗 선택방법
	// - 호어파티션 : 아무 값이나 하나 잡아서 제일 왼쪽에 위치시키고 피벗이라한다. 왼쪽부터 출발하면서 피벗보다 큰 값이 나오면 멈춤.
	// 오른쪽부터 출발하면서 피벗보다 작은갑싱 나오면 멈춤
	// 두 값을 바꿈. 다시 반복진행. 그러다가 R과 L이 교차되는순간(R이 더 작아지는순간) 피벗을 R의 위치로 옮긴다.
	// 이를 피벗의 왼쪽과, 피벗의 오른쪽을 나누어 시행한다.
	// - 로무토파티션 : 배열의 가장 오른쪽 값을 피벗으로 잡는다. left-1을 인덱스i로, 잡고 j를 left부터 증가시키면서 피벗과 값을
	// 비교한다.
	// 피벗보다 j일때 값이 크면 j를 그냥 증가시킨다. 피벗값보다 j일때 값이 작거나 같으면 i를 1 증가시키고 그 값과 j값을 바꾼다.
	// 최종적으로 j가 피벗의 값(right)까지 위치하면 i+1 인덱스와 right의 위치를 바꾼다.
	// 피벗을 다시 right의 위치로 잡고 다시 반복진행(피벗의 왼쪽과 오른쪽을 나눠서 진행).

	// 퀵정렬 - 호어파티션
	public static void sortQuickHoare(int[] arr, int left, int right) {
		if (left < right) {
			int pivot = partitionHoare(arr, left, right);
			sortQuickHoare(arr, left, pivot - 1);
			sortQuickHoare(arr, pivot + 1, right);
		}
	}

	public static int partitionHoare(int[] arr, int left, int right) {
		int pivot = arr[left];
		int L = left + 1;
		int R = right;
		while (L <= R) {
			while (L <= R && arr[L] <= pivot) {
				L++;
			}
			while (arr[R] > pivot) {
				R--;
			}
			if (L < R) {
				int tmp = arr[L];
				arr[L] = arr[R];
				arr[R] = tmp;
			}
		}
		int tmp = arr[left];
		arr[left] = arr[R];
		arr[R] = tmp;

		return R;
	}

	// 퀵정렬 - 로무토파티션
	public static void sortQuickLomuto(int[] arr, int left, int right) {
		if (left < right) {
			int pivot = partitionLomuto(arr, left, right);
			sortQuickLomuto(arr, left, pivot - 1);
			sortQuickLomuto(arr, pivot + 1, right);
		}
	}

	public static int partitionLomuto(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left - 1;

		for (int j = left; j < right; j++) {
			if (arr[j] <= pivot) {
				i++;
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}

		int tmp = arr[i + 1];
		arr[i + 1] = arr[right];
		arr[right] = tmp;

		return i + 1;
	}
}
