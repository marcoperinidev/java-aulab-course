import sum from './sum';

describe('sum', () => {
    it('should return 2 for 1 and 1', () => {
        expect(sum(1, 1)).toBe(2);
    });
});